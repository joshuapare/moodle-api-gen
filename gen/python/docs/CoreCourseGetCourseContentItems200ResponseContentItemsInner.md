# CoreCourseGetCourseContentItems200ResponseContentItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archetype** | **str** | The archetype of the module exposing the content item | [optional] 
**componentname** | **str** | The name of the component exposing the content item | [optional] 
**favourite** | **bool** | Has the user favourited the content item | [optional] 
**help** | **str** | Html description / help for the content item | [optional] 
**icon** | **str** | Html containing the icon for the content item | [optional] 
**id** | **int** | The id of the content item | [optional] 
**legacyitem** | **bool** | If this item was pulled from the old callback and has no item id. | [optional] 
**link** | **str** | The link to the content item creation page | [optional] 
**name** | **str** | Name of the content item | [optional] 
**purpose** | **str** | The purpose of the component exposing the content item | [optional] 
**recommended** | **bool** | Has this item been recommended | [optional] 
**title** | **str** | The string title of the content item, human readable | [optional] 

## Example

```python
from openapi_client.models.core_course_get_course_content_items200_response_content_items_inner import CoreCourseGetCourseContentItems200ResponseContentItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseContentItems200ResponseContentItemsInner from a JSON string
core_course_get_course_content_items200_response_content_items_inner_instance = CoreCourseGetCourseContentItems200ResponseContentItemsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseContentItems200ResponseContentItemsInner.to_json())

# convert the object into a dict
core_course_get_course_content_items200_response_content_items_inner_dict = core_course_get_course_content_items200_response_content_items_inner_instance.to_dict()
# create an instance of CoreCourseGetCourseContentItems200ResponseContentItemsInner from a dict
core_course_get_course_content_items200_response_content_items_inner_from_dict = CoreCourseGetCourseContentItems200ResponseContentItemsInner.from_dict(core_course_get_course_content_items200_response_content_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


