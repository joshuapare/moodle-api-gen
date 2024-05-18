# ModQuizGetAttemptReview200ResponseAttempt


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Sequentially numbers this students attempts at this quiz. | [optional] 
**currentpage** | **int** | Attempt current page. | [optional] 
**gradednotificationsenttime** | **int** | Time when the student was notified that manual grading of their attempt was complete. | [optional] 
**id** | **int** | Attempt id. | [optional] 
**layout** | **str** | Attempt layout. | [optional] 
**preview** | **int** | Whether is a preview attempt or not. | [optional] 
**quiz** | **int** | Foreign key reference to the quiz that was attempted. | [optional] 
**state** | **str** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] 
**sumgrades** | **float** | Total marks for this attempt. | [optional] 
**timecheckstate** | **int** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] 
**timefinish** | **int** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] 
**timemodified** | **int** | Last modified time. | [optional] 
**timemodifiedoffline** | **int** | Last modified time via webservices. | [optional] 
**timestart** | **int** | Time when the attempt was started. | [optional] 
**uniqueid** | **int** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] 
**userid** | **int** | Foreign key reference to the user whose attempt this is. | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_review200_response_attempt import ModQuizGetAttemptReview200ResponseAttempt

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptReview200ResponseAttempt from a JSON string
mod_quiz_get_attempt_review200_response_attempt_instance = ModQuizGetAttemptReview200ResponseAttempt.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptReview200ResponseAttempt.to_json())

# convert the object into a dict
mod_quiz_get_attempt_review200_response_attempt_dict = mod_quiz_get_attempt_review200_response_attempt_instance.to_dict()
# create an instance of ModQuizGetAttemptReview200ResponseAttempt from a dict
mod_quiz_get_attempt_review200_response_attempt_from_dict = ModQuizGetAttemptReview200ResponseAttempt.from_dict(mod_quiz_get_attempt_review200_response_attempt_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


