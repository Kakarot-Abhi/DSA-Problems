<div><div class="problems_header_content__o_4YA"><div class="problems_header_content__title__L2cB2 g-mb-0"><h3 class="g-m-0">Alternate positive and negative numbers</h3></div></div><div class="problems_header_description__t_8PB"><span class="problems_green__cbqrD"><strong>Easy</strong></span><span>Accuracy: <strong>33.86%</strong></span><span>Submissions: <strong>100k+</strong></span><span>Points: <strong>2</strong></span></div><div class="ui divider"></div><div><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an unsorted array <strong>Arr</strong> of <strong>N</strong> positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.<br>
<strong>Note: </strong>Array should start with a positive number.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: 
</strong>N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
<strong>Output:</strong>
9 -2 4 -1 5 -5 0 -3 2
<strong>Explanation : </strong>Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
<strong>Output:</strong>
5 -5 2 -2 4 -8 7 1 8 0
<strong>Explanation : </strong>Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.</span></pre>

<p><strong style="font-size:18px">Your Task:&nbsp;&nbsp;</strong></p>

<p><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>rearrange()</strong>&nbsp;which takes the array of integers&nbsp;<strong>arr[]</strong><strong>&nbsp;</strong>and<strong>&nbsp;n&nbsp;</strong>as parameters. You need to modify the array itself.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N&nbsp;≤ 10<sup>7</sup><br>
-10<sup>6</sup> ≤ Arr[i] ≤ 10<sup>7</sup></span></p>
</div></div><div class="problems_problem_description_links__045ME"><a href="/explore/?status[]=bookmarked" target="_blank" class="ui green basic label">View Bookmarked Problems <i aria-hidden="true" class="external alternate icon"></i></a></div><div class="accordion ui problems_accordion_tags_container__zk2Um"><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Company Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?company[]=Amazon" target="_blank" class="ui label problems_tag_label__A4Ism">Amazon</a><a href="/explore/?company[]=Paytm" target="_blank" class="ui label problems_tag_label__A4Ism">Paytm</a><a href="/explore/?company[]=VMWare" target="_blank" class="ui label problems_tag_label__A4Ism">VMWare</a><a href="/explore/?company[]=Microsoft" target="_blank" class="ui label problems_tag_label__A4Ism">Microsoft</a><a href="/explore/?company[]=Intuit " target="_blank" class="ui label problems_tag_label__A4Ism">Intuit </a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/explore/?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Courses</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="/courses/microsoft-test-series?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Microsoft SDE Preparation Test Series</a><a href="/courses/Must-Do-Premium?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Must Do Coding Questions - Self Paced</a><a href="/courses/test-series-bundle?vC=1" target="_blank" class="ui label problems_tag_label__A4Ism">Complete Test Series for Product-Based Companies</a></div></div></div><div class="problems_accordion_tags__JJ2DX "><div class="title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Related Interview Experiences</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content"><div class="ui labels"><a href="https://www.geeksforgeeks.org/paytm-interview-experience-set-9/" target="_blank" class="ui label problems_tag_label__A4Ism">Paytm Interview Experience Set 9</a><a href="https://www.geeksforgeeks.org/intuit-interview-experience-for-summer-internship-off-campus-2-months/" target="_blank" class="ui label problems_tag_label__A4Ism">Intuit Interview Experience For Summer Internship Off Campus 2 Months</a></div></div></div></div></div>