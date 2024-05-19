# CoreCourseToggleActivityRecommendation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | The favourite area (itemtype) | 
**id** | **int** | id of the activity or whatever | 
**status** | **bool** | If created or deleted | [default to False]

## Example

```python
from openapi_client.models.core_course_toggle_activity_recommendation200_response import CoreCourseToggleActivityRecommendation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseToggleActivityRecommendation200Response from a JSON string
core_course_toggle_activity_recommendation200_response_instance = CoreCourseToggleActivityRecommendation200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseToggleActivityRecommendation200Response.to_json())

# convert the object into a dict
core_course_toggle_activity_recommendation200_response_dict = core_course_toggle_activity_recommendation200_response_instance.to_dict()
# create an instance of CoreCourseToggleActivityRecommendation200Response from a dict
core_course_toggle_activity_recommendation200_response_from_dict = CoreCourseToggleActivityRecommendation200Response.from_dict(core_course_toggle_activity_recommendation200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


