#### Subarray with given sum

<div><div class="problems_header_content__o_4YA"><div class="problems_header_content__title__L2cB2 g-mb-0"><h3 class="g-m-0">Subarray with given sum<i aria-hidden="true" class="bookmark outline large icon"></i></h3></div><i aria-hidden="true" class="bug icon"></i></div><div class="problems_header_description__t_8PB"><span class="problems_green__cbqrD"><strong>Easy</strong></span><span>Accuracy: <strong>16.5%</strong></span><span>Submissions: <strong>100k+</strong></span><span>Points: <strong>2</strong></span></div><div class="ui divider"></div><div><div><a href="https://practice.geeksforgeeks.org/explore?page=1&amp;curated[]=1&amp;sortBy=submissions" target="_blank"><div style="margin: 14px 0px !important;" class="row"><div class="col-md-12 problems-promotional_banner" style="cursor:pointer; background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                     relative; padding: 1.5%; border-radius: 10px; justify-content: center; text-align: center; font-weight: 600; color: #333;                     font-size: 16px; font-family: sofia-pro"> <img src="https://media.geeksforgeeks.org/img-practice/MaskGroup72-1652267405.svg" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;"> <div style="display: flex;"> <span> This problem is part of GFG SDE Sheet. Click here to view more. &nbsp; </span>                             <img src="https://media.geeksforgeeks.org/img-practice/external-1657081738.svg"></div>                         </div></div></a></div><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an unsorted array <strong>A </strong>of size <strong>N</strong> that contains only&nbsp;non-negative integers, find a continuous sub-array which adds to a given number <strong>S</strong>.</span></p>

<p><span style="font-size:18px">In case of multiple subarrays, return the subarray which comes first on moving from left to right.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5, S = 12
A[] = {1,2,3,7,5}
<strong>Output: </strong>2 4<strong>
Explanation: </strong>The sum of elements 
from 2nd position to 4th position 
is 12.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
<strong>Output: </strong>1 5<strong>
Explanation: </strong>The sum of elements 
from 1st position to 5th position
is 15.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. The task is to complete the function <strong>subarraySum</strong>() which takes arr, N and S as input parameters and returns an <strong>arraylist&nbsp;</strong>containing the&nbsp;<strong>starting </strong>and <strong>ending </strong>positions&nbsp;of the&nbsp;first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting only one element that is -1.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">1 &lt;= A</span><sub>i</sub><span style="font-size:18px"> &lt;= 10<sup>9</sup></span></p>

<p>&nbsp;</p>
</div></div><div class="accordion ui problems_accordion_tags_container__zk2Um"></div></div>

**Note :-** Currently it is not optimized