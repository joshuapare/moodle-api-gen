# Org.OpenAPITools.Model.ModQuizGetQuizzesByCourses200ResponseQuizzesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowofflineattempts** | **int** | Whether to allow the quiz to be attempted                                                                             offline in the mobile app | [optional] [default to null]
**Attemptonlast** | **int** | Whether subsequent attempts start from the answer                                                                     to the previous attempt (1) or start blank (0). | [optional] [default to null]
**Attempts** | **int** | The maximum number of attempts a student is allowed. | [optional] [default to null]
**Autosaveperiod** | **int** | Auto-save delay | [optional] [default to null]
**Browsersecurity** | **string** | Restriciton on the browser the student must                                                                     use. E.g. &#39;securewindow&#39;. | [optional] [default to "null"]
**Canredoquestions** | **int** | Allows students to redo any completed question                                                                         within a quiz attempt. | [optional] [default to null]
**Completionattemptsexhausted** | **int** | Mark quiz complete when the student has                                                                                 exhausted the maximum number of attempts | [optional] [default to null]
**Completionpass** | **int** | Whether to require passing grade | [optional] [default to null]
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Decimalpoints** | **int** | Number of decimal points to use when displaying                                                                     grades. | [optional] [default to null]
**Delay1** | **int** | Delay that must be left between the first and second attempt,                                                             in seconds. | [optional] [default to null]
**Delay2** | **int** | Delay that must be left between the second and subsequent                                                             attempt, in seconds. | [optional] [default to null]
**Graceperiod** | **int** | The amount of time (in seconds) after the time limit                                                                 runs out during which attempts can still be submitted,                                                                 if overduehandling is set to allow it. | [optional] [default to null]
**Grade** | **decimal** | The total that the quiz overall grade is scaled to be                                                             out of. | [optional] [default to nullM]
**Grademethod** | **int** | One of the values QUIZ_GRADEHIGHEST, QUIZ_GRADEAVERAGE,                                                                     QUIZ_ATTEMPTFIRST or QUIZ_ATTEMPTLAST. | [optional] [default to null]
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Hasfeedback** | **int** | Whether the quiz has any non-blank feedback text | [optional] [default to null]
**Hasquestions** | **int** | Whether the quiz has questions | [optional] [default to null]
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | **string** | Forced activity language | [optional] 
**Name** | **string** | Activity name | [optional] 
**Navmethod** | **string** | Any constraints on how the user is allowed to navigate                                                                 around the quiz. Currently recognised values are                                                                 &#39;free&#39; and &#39;seq&#39;. | [optional] [default to "null"]
**Overduehandling** | **string** | The method used to handle overdue attempts.                                                                     &#39;autosubmit&#39;, &#39;graceperiod&#39; or &#39;autoabandon&#39;. | [optional] [default to "null"]
**Password** | **string** | A password that the student must enter before starting or                                                                 continuing a quiz attempt. | [optional] [default to "null"]
**Preferredbehaviour** | **string** | The behaviour to ask questions to use. | [optional] [default to "null"]
**Questiondecimalpoints** | **int** | Number of decimal points to use when                                                                             displaying question grades.                                                                             (-1 means use decimalpoints.) | [optional] [default to null]
**Questionsperpage** | **int** | How often to insert a page break when editing                                                                         the quiz, or when shuffling the question order. | [optional] [default to null]
**Reviewattempt** | **int** | Whether users are allowed to review their quiz                                                                     attempts at various times. This is a bit field, decoded by the                                                                     \\mod_quiz\\question\\display_options class. It is formed by ORing                                                                     together the constants defined there. | [optional] [default to null]
**Reviewcorrectness** | **int** | Whether users are allowed to review their quiz                                                        attempts at various times.A bit field, like reviewattempt. | [optional] [default to null]
**Reviewgeneralfeedback** | **int** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**Reviewmarks** | **int** | Whether users are allowed to review their quiz attempts                                                                 at various times. A bit field, like reviewattempt. | [optional] [default to null]
**Reviewmaxmarks** | **int** | Whether users are allowed to review their quiz                                                   attempts at various times. A bit field, like reviewattempt. | [optional] [default to null]
**Reviewoverallfeedback** | **int** | Whether users are allowed to review their quiz                                                                             attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**Reviewrightanswer** | **int** | Whether users are allowed to review their quiz                                                                         attempts at various times. A bit field, like                                                                         reviewattempt. | [optional] [default to null]
**Reviewspecificfeedback** | **int** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] 
**Section** | **int** | Course section id | [optional] 
**Showblocks** | **int** | Whether blocks should be shown on the attempt.php and                                                                 review.php pages. | [optional] [default to null]
**Showuserpicture** | **int** | Option to show the user&#39;s picture during the                                                                     attempt and on the review page. | [optional] [default to null]
**Shuffleanswers** | **int** | Whether the parts of the question should be shuffled,                                                                     in those question types that support it. | [optional] [default to null]
**Subnet** | **string** | Used to restrict the IP addresses from which this quiz can                                                             be attempted. The format is as requried by the address_in_subnet                                                             function. | [optional] [default to "null"]
**Sumgrades** | **decimal** | The total of all the question instance maxmarks. | [optional] [default to nullM]
**Timeclose** | **int** | The time when this quiz closes. (0 &#x3D; no restriction.) | [optional] [default to null]
**Timecreated** | **int** | The time when the quiz was added to the course. | [optional] [default to null]
**Timelimit** | **int** | The time limit for quiz attempts, in seconds. | [optional] [default to null]
**Timemodified** | **int** | Last modified time. | [optional] 
**Timeopen** | **int** | The time when this quiz opens. (0 &#x3D; no restriction.) | [optional] [default to null]
**Visible** | **bool** | Visible | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
