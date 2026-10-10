class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {

        vector<int> tmp;
        
        auto it = nums.begin();
        while (it != nums.end())
        {
            auto tit = find(tmp.begin(), tmp.end(), *it);
            if (tit == tmp.end())
                tmp.push_back(*it);
            else
                return true;
            it++;
        }

        return false;
    }
};