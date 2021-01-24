#include <iostream>
#include <string>
#include <unordered_map>
// 1678. Goal Parser Interpretation

std::string interpret(const std::string& command) {
    std::string interpretedString = "";
    std::unordered_map<std::string, std::string> interpreter({
        {"G", "G"},
        {"()", "o"},
        {"(al)", "al"}
    });

    std::string filler;

    for(char character : command){
        filler+= character;

        if(interpreter.count(filler)){
            interpretedString += interpreter[filler];
            filler = "";
        }
    }

    return interpretedString;
}

// Using Loops;
/*
std::string interpret(const std::string& command) {
    std::string interpretedString;

    for(int i = 0; i < command.size(); i++){
        if(command[i] == 'G')
            interpretedString += command[i];

        else if(command[i] == '(')
        {
            if(command[i + 1] == ')') {
                interpretedString += 'o';
                continue;
            }
            else if(command[i+1] == 'a' && command[i + 2] == 'l')
            {
                if(command[i+3] == ')')
                    interpretedString += "al";
            }
        }
    }

    return interpretedString;
}
*/

int main() {
    std::cout << "Hello, World!" << std::endl;
    std::cout << interpret("G()(al)") << std::endl;
    std::cout << interpret("G()()()()(al)") << std::endl;
    std::cout << interpret("(al)G(al)()()G") << std::endl;

    return 0;
}
