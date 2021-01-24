#include <iostream>
#include <vector>

std::vector<int> decode(std::vector<int>& encoded, int first) {
    std::vector<int> decoded;
    decoded.push_back(first);

    // a XOR b = c
    // then a XOR c = b

    for(int i = 0; i < encoded.size(); i++)
        decoded.push_back((decoded[i] ^ encoded[i]));

    return decoded;
}

int main() {
    std::cout << "Hello, World!" << std::endl;
    int first = 4;
    std::vector<int> encoded = {6, 2, 7, 3};

    std::vector<int> decoded = decode(encoded, first);

    for(auto number: decoded)
        std::cout << number << " ";

    return 0;
}
