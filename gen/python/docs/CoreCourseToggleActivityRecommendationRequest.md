# CoreCourseToggleActivityRecommendationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | The favourite area (itemtype) | [default to 'null']
**id** | **int** | id of the activity or whatever | [default to null]

## Example

```python
from openapi_client.models.core_course_toggle_activity_recommendation_request import CoreCourseToggleActivityRecommendationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseToggleActivityRecommendationRequest from a JSON string
core_course_toggle_activity_recommendation_request_instance = CoreCourseToggleActivityRecommendationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseToggleActivityRecommendationRequest.to_json())

# convert the object into a dict
core_course_toggle_activity_recommendation_request_dict = core_course_toggle_activity_recommendation_request_instance.to_dict()
# create an instance of CoreCourseToggleActivityRecommendationRequest from a dict
core_course_toggle_activity_recommendation_request_from_dict = CoreCourseToggleActivityRecommendationRequest.from_dict(core_course_toggle_activity_recommendation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


