#include <iostream>
#include <vector>

int maximumWealth(std::vector<std::vector<int>>& accounts) {
    int bankAccounts;
    int maximumWealth = 0;

    for(int i = 0; i < accounts.size(); i++){
        int wealth = 0;
        bankAccounts = accounts[i].size();

        for(int j = 0; j < bankAccounts; j++)
            wealth += accounts[i][j];

        if(wealth > maximumWealth)
            maximumWealth = wealth;
    }
    return maximumWealth;
}

int main() {
    std::vector<std::vector<int>> accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

    std::cout << "- Maximum Wealth: " << maximumWealth(accounts) << std::endl;
    return 0;
}
