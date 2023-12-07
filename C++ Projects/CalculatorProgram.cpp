#include <iostream>
using namespace std;

int main(){

    char op;
    double number1;
    double number2;
    double result;

    cout << "********************CALCULATOR********************\n";

    cout << "Choose operator (+ - * /): ";
    cin >> op;

    cout << "Enter number 1: \n";
    cin >> number1;

    cout << "Enter number 2: ";
    cin >> number2;

    switch(op){
        case '+':
            result = number1 + number2;
            cout << "Result = " << result << '\n';
            break;

        case '-':
            result = number1 - number2;
            cout << "Result = " << result << '\n';
            break;

        case '*':
            result = number1 * number2;
            cout << "Result = " << result << '\n';
            break;

        case '/':
            result = number1 / number2;
            cout << "Result = " << result << '\n';
            break;

        default:
            cout << "Enter a valid response!\n";
            break;
    }

    cout << "**************************************************";

    return 0;
}