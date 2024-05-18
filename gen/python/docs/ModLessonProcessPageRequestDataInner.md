# ModLessonProcessPageRequestDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | data name | [optional] [default to 'null']
**value** | **str** | data value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_lesson_process_page_request_data_inner import ModLessonProcessPageRequestDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModLessonProcessPageRequestDataInner from a JSON string
mod_lesson_process_page_request_data_inner_instance = ModLessonProcessPageRequestDataInner.from_json(json)
# print the JSON string representation of the object
print(ModLessonProcessPageRequestDataInner.to_json())

# convert the object into a dict
mod_lesson_process_page_request_data_inner_dict = mod_lesson_process_page_request_data_inner_instance.to_dict()
# create an instance of ModLessonProcessPageRequestDataInner from a dict
mod_lesson_process_page_request_data_inner_from_dict = ModLessonProcessPageRequestDataInner.from_dict(mod_lesson_process_page_request_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


