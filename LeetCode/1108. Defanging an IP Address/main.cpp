#include <iostream>

std::string defangIPaddr(const std::string& address) {
    std::string defangedVersion;

    for(char character : address){
        if(character != '.')
            defangedVersion+= character;

        else{
            defangedVersion+= {'[', character, ']'};
        }
    }
    return defangedVersion;
}

int main() {
    std::cout << defangIPaddr("1.1.1.1") << std::endl;
    std::cout << defangIPaddr("255.100.50.0") << std::endl;

    return 0;
}
