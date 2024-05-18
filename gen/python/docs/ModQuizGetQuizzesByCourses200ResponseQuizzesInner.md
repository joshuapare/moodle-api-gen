# ModQuizGetQuizzesByCourses200ResponseQuizzesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowofflineattempts** | **int** | Whether to allow the quiz to be attempted                                                                             offline in the mobile app | [optional] [default to null]
**attemptonlast** | **int** | Whether subsequent attempts start from the answer                                                                     to the previous attempt (1) or start blank (0). | [optional] [default to null]
**attempts** | **int** | The maximum number of attempts a student is allowed. | [optional] [default to null]
**autosaveperiod** | **int** | Auto-save delay | [optional] [default to null]
**browsersecurity** | **str** | Restriciton on the browser the student must                                                                     use. E.g. &#39;securewindow&#39;. | [optional] [default to 'null']
**canredoquestions** | **int** | Allows students to redo any completed question                                                                         within a quiz attempt. | [optional] [default to null]
**completionattemptsexhausted** | **int** | Mark quiz complete when the student has                                                                                 exhausted the maximum number of attempts | [optional] [default to null]
**completionpass** | **int** | Whether to require passing grade | [optional] [default to null]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**decimalpoints** | **int** | Number of decimal points to use when displaying                                                                     grades. | [optional] [default to null]
**delay1** | **int** | Delay that must be left between the first and second attempt,                                                             in seconds. | [optional] [default to null]
**delay2** | **int** | Delay that must be left between the second and subsequent                                                             attempt, in seconds. | [optional] [default to null]
**graceperiod** | **int** | The amount of time (in seconds) after the time limit                                                                 runs out during which attempts can still be submitted,                                                                 if overduehandling is set to allow it. | [optional] [default to null]
**grade** | **float** | The total that the quiz overall grade is scaled to be                                                             out of. | [optional] [default to null]
**grademethod** | **int** | One of the values QUIZ_GRADEHIGHEST, QUIZ_GRADEAVERAGE,                                                                     QUIZ_ATTEMPTFIRST or QUIZ_ATTEMPTLAST. | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**hasfeedback** | **int** | Whether the quiz has any non-blank feedback text | [optional] [default to null]
**hasquestions** | **int** | Whether the quiz has questions | [optional] [default to null]
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**navmethod** | **str** | Any constraints on how the user is allowed to navigate                                                                 around the quiz. Currently recognised values are                                                                 &#39;free&#39; and &#39;seq&#39;. | [optional] [default to 'null']
**overduehandling** | **str** | The method used to handle overdue attempts.                                                                     &#39;autosubmit&#39;, &#39;graceperiod&#39; or &#39;autoabandon&#39;. | [optional] [default to 'null']
**password** | **str** | A password that the student must enter before starting or                                                                 continuing a quiz attempt. | [optional] [default to 'null']
**preferredbehaviour** | **str** | The behaviour to ask questions to use. | [optional] [default to 'null']
**questiondecimalpoints** | **int** | Number of decimal points to use when                                                                             displaying question grades.                                                                             (-1 means use decimalpoints.) | [optional] [default to null]
**questionsperpage** | **int** | How often to insert a page break when editing                                                                         the quiz, or when shuffling the question order. | [optional] [default to null]
**reviewattempt** | **int** | Whether users are allowed to review their quiz                                                                     attempts at various times. This is a bit field, decoded by the                                                                     \\mod_quiz\\question\\display_options class. It is formed by ORing                                                                     together the constants defined there. | [optional] [default to null]
**reviewcorrectness** | **int** | Whether users are allowed to review their quiz                                                        attempts at various times.A bit field, like reviewattempt. | [optional] [default to null]
**reviewgeneralfeedback** | **int** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**reviewmarks** | **int** | Whether users are allowed to review their quiz attempts                                                                 at various times. A bit field, like reviewattempt. | [optional] [default to null]
**reviewmaxmarks** | **int** | Whether users are allowed to review their quiz                                                   attempts at various times. A bit field, like reviewattempt. | [optional] [default to null]
**reviewoverallfeedback** | **int** | Whether users are allowed to review their quiz                                                                             attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] [default to null]
**reviewrightanswer** | **int** | Whether users are allowed to review their quiz                                                                         attempts at various times. A bit field, like                                                                         reviewattempt. | [optional] [default to null]
**reviewspecificfeedback** | **int** | Whether users are allowed to review their                                                                             quiz attempts at various times. A bit field, like                                                                             reviewattempt. | [optional] 
**section** | **int** | Course section id | [optional] 
**showblocks** | **int** | Whether blocks should be shown on the attempt.php and                                                                 review.php pages. | [optional] [default to null]
**showuserpicture** | **int** | Option to show the user&#39;s picture during the                                                                     attempt and on the review page. | [optional] [default to null]
**shuffleanswers** | **int** | Whether the parts of the question should be shuffled,                                                                     in those question types that support it. | [optional] [default to null]
**subnet** | **str** | Used to restrict the IP addresses from which this quiz can                                                             be attempted. The format is as requried by the address_in_subnet                                                             function. | [optional] [default to 'null']
**sumgrades** | **float** | The total of all the question instance maxmarks. | [optional] [default to null]
**timeclose** | **int** | The time when this quiz closes. (0 &#x3D; no restriction.) | [optional] [default to null]
**timecreated** | **int** | The time when the quiz was added to the course. | [optional] [default to null]
**timelimit** | **int** | The time limit for quiz attempts, in seconds. | [optional] [default to null]
**timemodified** | **int** | Last modified time. | [optional] 
**timeopen** | **int** | The time when this quiz opens. (0 &#x3D; no restriction.) | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_quizzes_by_courses200_response_quizzes_inner import ModQuizGetQuizzesByCourses200ResponseQuizzesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetQuizzesByCourses200ResponseQuizzesInner from a JSON string
mod_quiz_get_quizzes_by_courses200_response_quizzes_inner_instance = ModQuizGetQuizzesByCourses200ResponseQuizzesInner.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetQuizzesByCourses200ResponseQuizzesInner.to_json())

# convert the object into a dict
mod_quiz_get_quizzes_by_courses200_response_quizzes_inner_dict = mod_quiz_get_quizzes_by_courses200_response_quizzes_inner_instance.to_dict()
# create an instance of ModQuizGetQuizzesByCourses200ResponseQuizzesInner from a dict
mod_quiz_get_quizzes_by_courses200_response_quizzes_inner_from_dict = ModQuizGetQuizzesByCourses200ResponseQuizzesInner.from_dict(mod_quiz_get_quizzes_by_courses200_response_quizzes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

