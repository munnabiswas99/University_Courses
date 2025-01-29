#include <stdio.h>

int isPalindromeRecursive(int num, int temp) {
    if (num == 0) {
        return temp;
    }
    temp = temp * 10 + num % 10;
    return isPalindromeRecursive(num / 10, temp);
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    int reversed = isPalindromeRecursive(num, 0);

    if (num == reversed) {
        printf("%d is a palindrome.\n", num);
    } else {
        printf("%d is not a palindrome.\n", num);
    }

    return 0;
}

