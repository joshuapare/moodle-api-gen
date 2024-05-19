# ModLessonGetPageData200ResponseMessagesInner

The lesson generated messages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message. | [optional] 
**type** | **str** | Message type: usually a CSS identifier like:                                 success, info, warning, error, notifyproblem, notifyerror, notifytiny, notifysuccess | [optional] 

## Example

```python
from openapi_client.models.mod_lesson_get_page_data200_response_messages_inner import ModLessonGetPageData200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonGetPageData200ResponseMessagesInner from a JSON string
mod_lesson_get_page_data200_response_messages_inner_instance = ModLessonGetPageData200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonGetPageData200ResponseMessagesInner.to_json())

# convert the object into a dict
mod_lesson_get_page_data200_response_messages_inner_dict = mod_lesson_get_page_data200_response_messages_inner_instance.to_dict()
# create an instance of ModLessonGetPageData200ResponseMessagesInner from a dict
mod_lesson_get_page_data200_response_messages_inner_from_dict = ModLessonGetPageData200ResponseMessagesInner.from_dict(mod_lesson_get_page_data200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


