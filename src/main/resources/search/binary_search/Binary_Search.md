<div><div class="problems_header_content__o_4YA"><div class="problems_header_content__title__L2cB2 g-mb-0"><h3 class="g-m-0">Binary Search</h3></div></div><div class="problems_header_description__t_8PB"><span class="problems_green__cbqrD"><strong>Basic</strong></span><span>Accuracy: <strong>44.32%</strong></span><span>Submissions: <strong>100k+</strong></span><span>Points: <strong>1</strong></span></div><div class="ui divider"></div><div><div><a href="https://practice.geeksforgeeks.org/explore?page=1&amp;curated[]=1&amp;sortBy=submissions" target="_blank"><div style="margin: 14px 0px !important;" class="row"><div class="col-md-12 problems-promotional_banner" style="cursor:pointer; background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                     relative; padding: 1.5%; border-radius: 10px; justify-content: center; text-align: center; font-weight: 600; color: #333;                     font-size: 16px; font-family: sofia-pro"> <img src="https://media.geeksforgeeks.org/img-practice/MaskGroup72-1652267405.svg" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;"> <div style="display: flex;"> <span> This problem is part of GFG SDE Sheet. Click here to view more. &nbsp; </span>                             <img src="https://media.geeksforgeeks.org/img-practice/external-1657081738.svg"></div>                         </div></div></a></div><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a sorted array of size <strong>N</strong> and an integer <strong>K</strong>, find the position at which <strong>K</strong> is present in the array using binary search.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
arr[] = {1 2 3 4 5} 
K = 4
<strong>Output:</strong> 3
<strong>Explanation:</strong> 4 appears at index 3.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
arr[] = {11 22 33 44 55} 
K = 445
<strong>Output:</strong> -1
<strong>Explanation:</strong> 445 is not present.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>binarysearch()</strong> which takes <strong>arr[]</strong>, <strong>N</strong> and <strong>K</strong> as input parameters and returns the index of <strong>K</strong> in the array. If <strong>K</strong> is not present in the array, return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(LogN)<br>
<strong>Expected Auxiliary Space:</strong> O(LogN) if solving recursively and O(1) otherwise.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span></p>

<ul>
	<li><span style="font-size:18px">1 &lt;= N &lt;= 10</span><sup><span style="font-size:15px">5</span></sup></li>
	<li><span style="font-size:18px">1 &lt;= arr[i] &lt;= 10<sup>6</sup></span></li>
	<li><span style="font-size:18px">1 &lt;= K &lt;= 10<sup>6</sup></span></li>
</ul>
</div></div><div class="problems_problem_description_links__045ME"><a href="/explore/?status[]=bookmarked" target="_blank" class="ui green basic label">View Bookmarked Problems <i aria-hidden="true" class="external alternate icon"></i></a></div><div class="accordion ui problems_accordion_tags_container__zk2Um"><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Company Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?company[]=Accenture" target="_blank" class="ui label problems_tag_label__A4Ism">Accenture</a><a href="/explore/?company[]=Cognizant " target="_blank" class="ui label problems_tag_label__A4Ism">Cognizant </a><a href="/explore/?company[]=Infosys" target="_blank" class="ui label problems_tag_label__A4Ism">Infosys</a><a href="/explore/?company[]=Linkedin" target="_blank" class="ui label problems_tag_label__A4Ism">Linkedin</a><a href="/explore/?company[]=Oracle" target="_blank" class="ui label problems_tag_label__A4Ism">Oracle</a><a href="/explore/?company[]=Qualcomm" target="_blank" class="ui label problems_tag_label__A4Ism">Qualcomm</a><a href="/explore/?company[]=TCS" target="_blank" class="ui label problems_tag_label__A4Ism">TCS</a><a href="/explore/?company[]=Wipro" target="_blank" class="ui label problems_tag_label__A4Ism">Wipro</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore/?category[]=Divide and Conquer" target="_blank" class="ui label problems_tag_label__A4Ism">Divide and Conquer</a><a href="/explore/?category[]=Searching" target="_blank" class="ui label problems_tag_label__A4Ism">Searching</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Courses</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/courses/Must-Do-Premium?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Must Do Coding Questions - Self Paced</a><a href="/courses/flipkart-test-series?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Flipkart SDE Preparation Test Series</a><a href="/courses/test-series-bundle?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Complete Test Series for Product-Based Companies</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Interview Experiences</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="https://www.geeksforgeeks.org/qualcomm-interview-experience-set-9-experienced-linkedin-invite/" target="_blank" class="ui label problems_tag_label__A4Ism">Qualcomm Interview Experience Set 9 Experienced Linkedin Invite</a></div></div></div></div></div>
