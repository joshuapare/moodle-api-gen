# ModLessonProcessPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptsremaining** | **int** | Number of attempts remaining. | [default to null]
**correctanswer** | **bool** | Whether the answer is correct. | [default to False]
**displaymenu** | **bool** | Whether we should display the menu or not in this page. | 
**feedback** | **str** | The response feedback. | [default to 'null']
**inmediatejump** | **bool** | Whether the page processing redirect directly to anoter page. | [default to False]
**isessayquestion** | **bool** | Whether is a essay question. | [default to False]
**maxattemptsreached** | **bool** | Whether we reachered the max number of attempts. | [default to False]
**messages** | [**List[ModLessonGetPageData200ResponseMessagesInner]**](ModLessonGetPageData200ResponseMessagesInner.md) |  | 
**newpageid** | **int** | New page id (if a jump was made). | [default to null]
**noanswer** | **bool** | Whether there aren&#39;t answers. | [default to False]
**nodefaultresponse** | **bool** | Whether there is not a default response. | [default to False]
**ongoingscore** | **str** | The ongoing message. | [default to 'null']
**progress** | **int** | Progress percentage in the lesson. | [default to null]
**response** | **str** | The response. | [default to 'null']
**reviewmode** | **bool** | Whether the user is reviewing. | [default to False]
**studentanswer** | **str** | The student answer. | [default to 'null']
**userresponse** | **str** | The user response. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_process_page200_response import ModLessonProcessPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonProcessPage200Response from a JSON string
mod_lesson_process_page200_response_instance = ModLessonProcessPage200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonProcessPage200Response.to_json())

# convert the object into a dict
mod_lesson_process_page200_response_dict = mod_lesson_process_page200_response_instance.to_dict()
# create an instance of ModLessonProcessPage200Response from a dict
mod_lesson_process_page200_response_from_dict = ModLessonProcessPage200Response.from_dict(mod_lesson_process_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


