#include <iostream>
#include <windows.h>
using namespace std;

int main()
{
    int option = 0;

    string Sudan_Cars[5] = {"Nissan Bluebird Sylphy", "Nissan Tida", "Toyota Corolla", "Kia Cerato", "Toyota Yaris"};
    string SUVs[5] = {"Kia Seltos", "Kia Sorento", "Suzuki Grand Vitara", "Toyota Rav4", "Nissan QashQai"};
    string Trucks[5] = {"Toyota Hilux", "Toyota Tacoma", "Ford Ranger", "Chevrolet Colorado", "Nissan Frontier"};
    string Mini_Vans[5] = {"Toyota Sienna", "Volkswagen Routan", "Mazda Mazda5", "Chrysler Pacifica", "Honda Odyssey"};
    string Jeep[5] = {"Wrangler", "Compass", "Gladiator", "Grand Cherokee", "Patriot"};

    system("title Vehicle Garage Simulator");

    do
    {
        system("cls");

        cout << "\n---------------------------------------------------------"
             << "\nWelcome to The Vehicle Garage Simulator Program! Enjoy!"
             << "\n---------------------------------------------------------"
             << "\n                Vehicle Garage Simulator"
             << "\n---------------------------------------------------------"
             << "\n1. Create a garage of different vehicles."
             << "\n2. How to use."
             << "\n3. Exit."
             << "\n---------------------------------------------------------"
             << "\nChoose either option 1-3: ";
        cin >> option;

        system("cls");

        switch(option)
        {
        case 1:
            {
                int choice = 0;
                cout << "\n---------------------------------------------------------"
                    << "\n                   Choose any garage."
                    << "\n---------------------------------------------------------"
                    << "\n1. Garage 1."
                    << "\n2. Garage 2."
                    << "\n3. Garage 3."
                    << "\n---------------------------------------------------------"
                    << "\nChoose garages from 1-3: ";
                cin >> choice;

                switch(choice)
                {
                case 1:
                    {
                        int index = rand()%5;
                        system("cls");

                        cout << "Garage 1: " << endl;
                        cout << Sudan_Cars[index] << endl;
                        cout << SUVs[index] << endl;
                        cout << Trucks[index] << endl;
                        cout << Mini_Vans[index] << endl;
                        cout << Jeep[index] << endl;
                        system("pause");
                        break;
                    }
                
                case 2:
                    {
                        int index = rand()%5;
                        system("cls");

                        cout << "Garage 2: " << endl;
                        cout << Sudan_Cars[index] << endl;
                        cout << SUVs[index] << endl;
                        cout << Trucks[index] << endl;
                        cout << Mini_Vans[index] << endl;
                        cout << Jeep[index] << endl;
                        system("pause");
                        break;
                    }

                case 3:
                    {
                        int index = rand()%5;
                        system("cls");

                        cout << "Garage 3: " << endl;
                        cout << Sudan_Cars[index] << endl;
                        cout << SUVs[index] << endl;
                        cout << Trucks[index] << endl;
                        cout << Mini_Vans[index] << endl;
                        cout << Jeep[index] << endl;
                        system("pause");
                        break;
                    }

                }
            }
            break;
            system("cls");
        case 2:
            {
                cout << "\n--------------------------------------"
                     << "\nHow to use."
                     << "\n1. To create your garage of different vehicles select option 1."
                     << "\n2. When you select option 1, you would be directed to a screen that allows you to choose whether you want to use garage 1, 2 or 3."
                     << "\n3. When you choose either garage 1, 2 or 3, different cars would be randomly selected."
                     << "\n4. To Exit the program select option 3."
                     << "\n--------------------------------------" << endl;
                system("pause");
                break;
            }

        case 3:
            {
                char opt;

                cout << "\nAre you sure you want to exit? y if yes or n if no." << endl;
                cin >> opt;
               
                if(opt != 'n'){
                    break;
                }else{
                    cout << "\n---------------------------------------------------------"
                         << "\nWelcome to The Vehicle Garage Simulator Program! Enjoy!"
                         << "\n---------------------------------------------------------"
                         << "\n                Vehicle Garage Simulator"
                         << "\n---------------------------------------------------------"
                         << "\n1. Create a garage of different vehicles."
                         << "\n2. How to use."
                         << "\n3. Exit."
                         << "\n---------------------------------------------------------"
                         << "\nChoose either option 1-3: ";
                    cin >> option;
                }
            }
            break;

        default:
            {
                cout << "\n\nInvalid option!!!" << endl;
                system("pause");
            }
        }

    }while(option != 3);



    return 0;
}

void randCars(string Sudan_Cars[], string SUVs[], string Trucks[], string Mini_Vans[], string Jeep[], int index){

    index = rand()%5;
    Sudan_Cars[index];

    index = rand()%5;
    SUVs[index];

    index = rand()%5;
    Trucks[index];

    index = rand()%5;
    Mini_Vans[index];

    index = rand()%5;
    Jeep[index];

}