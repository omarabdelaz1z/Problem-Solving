#include <iostream>
#include <unordered_map>
#include <vector>

// O(N^2) Solution
std::vector<int> twoSumNaive(std::vector<int>& nums, int target) {
    for(int i = 0; i < nums.size(); i++)
    {
        for(int j = i + 1; j < nums.size(); j++)
        {
            int complement = target - nums[i];

            if(nums[j] == complement)
                return {i, j};
        }
    }
    return {};
}

// O(N) Solution
std::vector<int> twoSumOptimized(std::vector<int>&nums, int target){
    std::unordered_map<int, int> complements;

    for(int i = 1; i <= nums.size(); i++){
        int complement = target - nums[i - 1];

        if(complements.count(complement))
            return {complements[complement], i - 1};

        complements[nums[i-1]] = i - 1;
    }
    return {};
}


int main() {
    int target = 9;
    std::vector<int> nums = {2, 7, 11, 15};

    for(auto i: twoSumOptimized(nums, target))
        std::cout << i << " ";

    std::cout << std::endl;

    for(auto i: twoSumNaive(nums, target))
        std::cout << i << " ";

    return 0;
}
