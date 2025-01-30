#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of the case: ");
    scanf("%d", &n);

    // Clear the input buffer
    while (getchar() != '\n');

    char charArray[n];

    for (int i = 0; i < n; i++) {
        scanf("%c", &charArray[i]);

        // Clear the input buffer
        while (getchar() != '\n');
    }

    for (int i = 0; i < n; i++) {
            if ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z')) {
                    printf("%c is an Alphabet: ",charArray[i]);
        if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u' ||
            charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U') {
            printf("It is a vowel\n");
        } else {
            printf("It is a consonant\n");
        }
    } else if (charArray[i] >= '0' && charArray[i] <= '9') {
        printf("%c is a digit.\n", charArray[i]);
    } else {
        printf("%c is a special character.\n", charArray[i]);
    }
    }
    printf("\n");

    return 0;
}
