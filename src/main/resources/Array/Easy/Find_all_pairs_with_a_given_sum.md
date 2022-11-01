<div><div class="problems_header_content__o_4YA"><div class="problems_header_content__title__L2cB2 g-mb-0"><h3 class="g-m-0">Find all pairs with a given sum<i aria-hidden="true" class="bookmark outline large icon"></i></h3></div><i aria-hidden="true" class="bug icon"></i></div><div class="problems_header_description__t_8PB"><span class="problems_green__cbqrD"><strong>Easy</strong></span><span>Accuracy: <strong>23.94%</strong></span><span>Submissions: <strong>100k+</strong></span><span>Points: <strong>2</strong></span></div><div class="ui divider"></div><div><div><a href="https://practice.geeksforgeeks.org/explore?page=1&amp;curated[]=1&amp;sortBy=submissions" target="_blank"><div style="margin: 14px 0px !important;" class="row"><div class="col-md-12 problems-promotional_banner" style="cursor:pointer; background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                     relative; padding: 1.5%; border-radius: 10px; justify-content: center; text-align: center; font-weight: 600; color: #333;                     font-size: 16px; font-family: sofia-pro"> <img src="https://media.geeksforgeeks.org/img-practice/MaskGroup72-1652267405.svg" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;"> <div style="display: flex;"> <span> This problem is part of GFG SDE Sheet. Click here to view more. &nbsp; </span>                             <img src="https://media.geeksforgeeks.org/img-practice/external-1657081738.svg"></div>                         </div></div></a></div><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two unsorted arrays <strong>A</strong> of size <strong>N</strong> and <strong>B</strong> of size <strong>M</strong> of distinct elements, the task is to find all pairs from both arrays whose sum is equal to <strong>X</strong>.</span></p>

<p><span style="font-size:18px"><strong>Note:&nbsp;</strong>All pairs should be printed in <strong>increasing </strong>order of u. For eg. for two pairs (u<sub>1</sub>,v<sub>1</sub>) and (u<sub>2</sub>,v<sub>2</sub>), if u<sub>1</sub>2&nbsp;then<br>
(u<sub>1</sub>,v<sub>1</sub>) should be printed first else second.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8} 
X = 9 
<strong>Output: 
</strong>1 8
4 5 
5 4
<strong>Explanation:</strong>
(1, 8), (4, 5), (5, 4) are the
pairs which sum to 9.</span>
</pre>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input:</strong>
A[] = {-1, -2, 4, -6, 5, 7}
B[] = {6, 3, 4, 0} 
X = 8 
<strong>Output:</strong>
4 4 
5 3</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>allPairs()</strong>&nbsp;which takes the array <strong>A[]</strong>,<strong> B[]</strong>, its size <strong>N </strong>and <strong>M </strong>respectively,<strong> </strong>and<strong> </strong>an integer <strong>X&nbsp;</strong>as inputs and returns the sorted vector pair values of all the pairs u,v&nbsp;where u&nbsp;belongs to array&nbsp;A and v&nbsp;belongs to array B. If no such pair exists return empty vector pair.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(NLog(N))<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N, M&nbsp;≤ 10<sup>6</sup><br>
-10<sup>6</sup> ≤ X, A[i], B[i] ≤ 10<sup>6</sup></span></p>
</div></div><div class="problems_problem_description_links__045ME"><a href="/explore/?status[]=bookmarked" target="_blank" class="ui green basic label">View Bookmarked Problems <i aria-hidden="true" class="external alternate icon"></i></a></div><div class="accordion ui problems_accordion_tags_container__zk2Um"><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Company Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?company[]=Amazon" target="_blank" class="ui label problems_tag_label__A4Ism">Amazon</a><a href="/explore/?company[]=Facebook" target="_blank" class="ui label problems_tag_label__A4Ism">Facebook</a><a href="/explore/?company[]=United Health Group" target="_blank" class="ui label problems_tag_label__A4Ism">United Health Group</a><a href="/explore/?company[]=MakeMyTrip" target="_blank" class="ui label problems_tag_label__A4Ism">MakeMyTrip</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore/?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Courses</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/courses/Must-Do-Premium?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Must Do Coding Questions - Self Paced</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Interview Experiences</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="https://www.geeksforgeeks.org/makemytrip-interview-experience-for-software-engineer/" target="_blank" class="ui label problems_tag_label__A4Ism">Makemytrip Interview Experience For Software Engineer</a></div></div></div></div></div>