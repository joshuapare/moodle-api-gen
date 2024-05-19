# CoreGradesGetGradeitems200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade_items** | [**List[CoreGradesGetGradeitems200ResponseGradeItemsInner]**](CoreGradesGetGradeitems200ResponseGradeItemsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_get_gradeitems200_response import CoreGradesGetGradeitems200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetGradeitems200Response from a JSON string
core_grades_get_gradeitems200_response_instance = CoreGradesGetGradeitems200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetGradeitems200Response.to_json())

# convert the object into a dict
core_grades_get_gradeitems200_response_dict = core_grades_get_gradeitems200_response_instance.to_dict()
# create an instance of CoreGradesGetGradeitems200Response from a dict
core_grades_get_gradeitems200_response_from_dict = CoreGradesGetGradeitems200Response.from_dict(core_grades_get_gradeitems200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


