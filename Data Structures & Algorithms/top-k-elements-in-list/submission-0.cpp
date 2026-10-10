class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> fre;

        for (auto it = nums.begin(); it < nums.end(); it++)
        {
            if (fre.find(*it) != fre.end())
                fre[*it]++;
            else
                fre[*it] = 1; 
        }

        vector< pair<int, int> > res(fre.begin(), fre.end());
        sort(res.begin(), res.end(),
            [] (const pair<int, int>& a, const pair<int, int>& b){ return a.second > b.second; });
        
        vector<int> ans;

        for (int i = 0; i < k; i++) {
            ans.push_back(res[i].first);
        }
        return ans;
    }
};
