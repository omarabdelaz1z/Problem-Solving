#include <iostream>
#include <vector>

std::vector<bool> kidsWithCandies(std::vector<int>& candies, int extraCandies) {
    int maximumCandies = candies[0];
    std::vector<bool> result;

    for(int i = 1; i < candies.size(); i++) {
        if(candies[i] > maximumCandies)
            maximumCandies = candies[i];
    }

    for(int candie : candies){
        candie + extraCandies >= maximumCandies
            ? result.push_back(true)
            : result.push_back(false);
    }

    return result;
}

int main() {
    std::vector<int> candies = {12, 1, 12};
    int extraCandies = 10;
    std::vector<bool> result = kidsWithCandies(candies, extraCandies);

    for(auto element: result)
        std::cout << element << std::endl;

    return 0;
}
