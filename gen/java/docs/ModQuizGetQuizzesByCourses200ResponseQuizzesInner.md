

# ModQuizGetQuizzesByCourses200ResponseQuizzesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowofflineattempts** | **Integer** | Whether to allow the quiz to be attempted                                                                             offline in the mobile app |  [optional] |
|**attemptonlast** | **Integer** | Whether subsequent attempts start from the answer                                                                     to the previous attempt (1) or start blank (0). |  [optional] |
|**attempts** | **Integer** | The maximum number of attempts a student is allowed. |  [optional] |
|**autosaveperiod** | **Integer** | Auto-save delay |  [optional] |
|**browsersecurity** | **String** | Restriciton on the browser the student must                                                                     use. E.g. &#39;securewindow&#39;. |  [optional] |
|**canredoquestions** | **Integer** | Allows students to redo any completed question                                                                         within a quiz attempt. |  [optional] |
|**completionattemptsexhausted** | **Integer** | Mark quiz complete when the student has                                                                                 exhausted the maximum number of attempts |  [optional] |
|**completionpass** | **Integer** | Whether to require passing grade |  [optional] |
|**course** | **Integer** | Course id |  [optional] |
|**coursemodule** | **Integer** | Course module id |  [optional] |
|**decimalpoints** | **Integer** | Number of decimal points to use when displaying                                                                     grades. |  [optional] |
|**delay1** | **Integer** | Delay that must be left between the first and second attempt,                                                             in seconds. |  [optional] |
|**delay2** | **Integer** | Delay that must be left between the second and subsequent                                                             attempt, in seconds. |  [optional] |
|**graceperiod** | **Integer** | The amount of time (in seconds) after the time limit                                                                 runs out during which attempts can still be submitted,                                                                 if overduehandling is set to allow it. |  [optional] |
|**grade** | **BigDecimal** | The total that the quiz overall grade is scaled to be                                                             out of. |  [optional] |
|**grademethod** | **Integer** | One of the values QUIZ_GRADEHIGHEST, QUIZ_GRADEAVERAGE,                                                                     QUIZ_ATTEMPTFIRST or QUIZ_ATTEMPTLAST. |  [optional] |
|**groupingid** | **Integer** | Group id |  [optional] |
|**groupmode** | **Integer** | Group mode |  [optional] |
|**hasfeedback** | **Integer** | Whether the quiz has any non-blank feedback text |  [optional] |
|**hasquestions** | **Integer** | Whether the quiz has questions |  [optional] |
|**id** | **Integer** | Activity instance id |  [optional] |
|**intro** | **String** | Activity introduction |  [optional] |
|**introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**lang** | **String** | Forced activity language |  [optional] |
|**name** | **String** | Activity name |  [optional] |
|**navmethod** | **String** | Any constraints on how the user is allowed to navigate                                                                 around the quiz. Currently recognised values are                                                                 &#39;free&#39; and &#39;seq&#39;. |  [optional] |
|**overduehandling** | **String** | The method used to handle overdue attempts.                                                                     &#39;autosubmit&#39;, &#39;graceperiod&#39; or &#39;autoabandon&#39;. |  [optional] |
|**password** | **String** | A password that the student must enter before starting or                                                                 continuing a quiz attempt. |  [optional] |
|**preferredbehaviour** | **String** | The behaviour to ask questions to use. |  [optional] |
|**questiondecimalpoints** | **Integer** | Number of decimal points to use when                                                                             displaying question grades.                                                                             (-1 means use decimalpoints.) |  [optional] |
|**questionsperpage** | **Integer** | How often to insert a page break when editing                                                                         the quiz, or when shuffling the question order. |  [optional] |
|**reviewattempt** | **Integer** | Whether users are allowed to review their quiz                                                                     attempts at various times. This is a bit field, decoded by the                                                                     \\mod_quiz\\question\\display_options class. It is formed by ORing                                                                     together the constants defined there. |  [optional] |
|**reviewcorrectness** | **Integer** | Whether users are allowed to review their quiz                                                        attempts at various times.A bit field, like reviewattempt. |  [optional] |
|**reviewgeneralfeedback** | **Integer** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. |  [optional] |
|**reviewmarks** | **Integer** | Whether users are allowed to review their quiz attempts                                                                 at various times. A bit field, like reviewattempt. |  [optional] |
|**reviewmaxmarks** | **Integer** | Whether users are allowed to review their quiz                                                   attempts at various times. A bit field, like reviewattempt. |  [optional] |
|**reviewoverallfeedback** | **Integer** | Whether users are allowed to review their quiz                                                                             attempts at various times. A bit field, like                                                                             reviewattempt. |  [optional] |
|**reviewrightanswer** | **Integer** | Whether users are allowed to review their quiz                                                                         attempts at various times. A bit field, like                                                                         reviewattempt. |  [optional] |
|**reviewspecificfeedback** | **Integer** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. |  [optional] |
|**section** | **Integer** | Course section id |  [optional] |
|**showblocks** | **Integer** | Whether blocks should be shown on the attempt.php and                                                                 review.php pages. |  [optional] |
|**showuserpicture** | **Integer** | Option to show the user&#39;s picture during the                                                                     attempt and on the review page. |  [optional] |
|**shuffleanswers** | **Integer** | Whether the parts of the question should be shuffled,                                                                     in those question types that support it. |  [optional] |
|**subnet** | **String** | Used to restrict the IP addresses from which this quiz can                                                             be attempted. The format is as requried by the address_in_subnet                                                             function. |  [optional] |
|**sumgrades** | **BigDecimal** | The total of all the question instance maxmarks. |  [optional] |
|**timeclose** | **Integer** | The time when this quiz closes. (0 &#x3D; no restriction.) |  [optional] |
|**timecreated** | **Integer** | The time when the quiz was added to the course. |  [optional] |
|**timelimit** | **Integer** | The time limit for quiz attempts, in seconds. |  [optional] |
|**timemodified** | **Integer** | Last modified time. |  [optional] |
|**timeopen** | **Integer** | The time when this quiz opens. (0 &#x3D; no restriction.) |  [optional] |
|**visible** | **Boolean** | Visible |  [optional] |



