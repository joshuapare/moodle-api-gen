# ModLessonGetPageData200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**List[ModLessonGetPageData200ResponseAnswersInner]**](ModLessonGetPageData200ResponseAnswersInner.md) |  | 
**contentfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**displaymenu** | **bool** | Whether we should display the menu or not in this page. | [default to False]
**messages** | [**List[ModLessonGetPageData200ResponseMessagesInner]**](ModLessonGetPageData200ResponseMessagesInner.md) |  | 
**newpageid** | **int** | New page id (if a jump was made) | [default to null]
**ongoingscore** | **str** | The ongoing score message | [default to 'null']
**page** | [**ModLessonGetPageData200ResponsePage**](ModLessonGetPageData200ResponsePage.md) |  | [optional] 
**pagecontent** | **str** | Page html content | [optional] [default to 'null']
**progress** | **int** | Progress percentage in the lesson | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_page_data200_response import ModLessonGetPageData200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPageData200Response from a JSON string
mod_lesson_get_page_data200_response_instance = ModLessonGetPageData200Response.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPageData200Response.to_json())

# convert the object into a dict
mod_lesson_get_page_data200_response_dict = mod_lesson_get_page_data200_response_instance.to_dict()
# create an instance of ModLessonGetPageData200Response from a dict
mod_lesson_get_page_data200_response_from_dict = ModLessonGetPageData200Response.from_dict(mod_lesson_get_page_data200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


