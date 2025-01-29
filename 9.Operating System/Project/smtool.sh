#!/bin/bash

# Define all functions at the top of the script

system_health() {
    echo "===== System Health ====="
    echo "CPU Load: $(uptime | awk -F'load average:' '{ print $2 }')"
    echo "Memory Usage:"
    free -h
    echo "Disk Usage:"
    df -h
    echo "CPU Information:"
    lscpu | grep 'Model name'
    echo
}

user_sessions() {
    echo "===== Active User Sessions ====="
    who
    echo
    echo "Detailed Session Info:"
    w
    echo
}

process_monitoring() {
    echo "===== Process Monitoring ====="
    ps aux --sort=-%cpu | head -10
    echo
    echo "Enter a process name to search (or press Enter to skip):"
    read -r process_name
    if [ -n "$process_name" ]; then
        ps aux | grep "$process_name" | grep -v "grep"
        echo "Enter PID to terminate (or press Enter to skip):"
        read -r pid
        if [ -n "$pid" ]; then
            kill "$pid" && echo "Process $pid terminated."
        fi
    fi
}


network_usage() {
    echo "===== Network Usage ====="
    echo "Active Network Connections:"
    if command -v ss &> /dev/null; then
        ss -tuln
    else
        echo "ss command not found. Please install the 'iproute2' package."
    fi
    echo
    echo "Network Interface Statistics:"
    if command -v ip &> /dev/null; then
        ip -s link
    else
        echo "ip command not found. Please install the 'iproute2' package."
    fi
    echo
}

log_analysis() {
    echo "===== Log Analysis ====="
    echo "Last 10 Failed Login Attempts:"
    grep "Failed password" /var/log/auth.log | tail -10
    echo
    echo "Last 10 Successful Login Attempts:"
    grep "Accepted" /var/log/auth.log | tail -10
    echo
    echo "Recent System Errors:"
    tail -20 /var/log/syslog | grep -i "error"
    echo
}


# Main menu
while true; do
    echo "===== User and System Monitoring Tool ====="
    echo "1. System Health Monitoring"
    echo "2. Active User Session Tracker"
    echo "3. Process Monitoring"
    echo "4. Network Usage Monitor"
    echo "5. Log Analysis and Reporting"
    echo "6. Exit"
    echo "Select an option:"
    read -r option

    case $option in
        1) system_health ;;
        2) user_sessions ;;
        3) process_monitoring ;;
        4) network_usage ;;
        5) log_analysis ;;
        6) echo "Exiting..."; exit ;;
        *) echo "Invalid option. Please try again." ;;
    esac
done


