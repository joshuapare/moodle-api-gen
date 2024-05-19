# CoreCourseGetCourseContentItems200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_items** | [**List[CoreCourseGetCourseContentItems200ResponseContentItemsInner]**](CoreCourseGetCourseContentItems200ResponseContentItemsInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_get_course_content_items200_response import CoreCourseGetCourseContentItems200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseContentItems200Response from a JSON string
core_course_get_course_content_items200_response_instance = CoreCourseGetCourseContentItems200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseContentItems200Response.to_json())

# convert the object into a dict
core_course_get_course_content_items200_response_dict = core_course_get_course_content_items200_response_instance.to_dict()
# create an instance of CoreCourseGetCourseContentItems200Response from a dict
core_course_get_course_content_items200_response_from_dict = CoreCourseGetCourseContentItems200Response.from_dict(core_course_get_course_content_items200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


