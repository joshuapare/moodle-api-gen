# ModQuizAddRandomQuestionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addonpage** | **int** | The page where random questions will be added to | [default to null]
**cmid** | **int** | The cmid of the quiz | [default to null]
**filtercondition** | **str** | (Optional) The filter condition used when adding random questions from an existing category.                     Not required if adding random questions from a new category. | [optional] [default to '']
**newcategory** | **str** | (Optional) The name of a new question category to create and use for the random questions. | [optional] [default to '']
**parentcategory** | **str** | (Optional) The parent of the new question category, if creating one. | [optional] [default to '0']
**randomcount** | **int** | Number of random questions | [default to null]

## Example

```python
from openapi_client.models.mod_quiz_add_random_questions_request import ModQuizAddRandomQuestionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizAddRandomQuestionsRequest from a JSON string
mod_quiz_add_random_questions_request_instance = ModQuizAddRandomQuestionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizAddRandomQuestionsRequest.to_json())

# convert the object into a dict
mod_quiz_add_random_questions_request_dict = mod_quiz_add_random_questions_request_instance.to_dict()
# create an instance of ModQuizAddRandomQuestionsRequest from a dict
mod_quiz_add_random_questions_request_from_dict = ModQuizAddRandomQuestionsRequest.from_dict(mod_quiz_add_random_questions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


