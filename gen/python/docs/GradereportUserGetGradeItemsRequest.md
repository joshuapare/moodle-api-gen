# GradereportUserGetGradeItemsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course Id | 
**groupid** | **int** | Get users from this group only | [optional] [default to 0]
**userid** | **int** | Return grades only for this user (optional) | [optional] [default to 0]

## Example

```python
from openapi_client.models.gradereport_user_get_grade_items_request import GradereportUserGetGradeItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradeItemsRequest from a JSON string
gradereport_user_get_grade_items_request_instance = GradereportUserGetGradeItemsRequest.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradeItemsRequest.to_json())

# convert the object into a dict
gradereport_user_get_grade_items_request_dict = gradereport_user_get_grade_items_request_instance.to_dict()
# create an instance of GradereportUserGetGradeItemsRequest from a dict
gradereport_user_get_grade_items_request_from_dict = GradereportUserGetGradeItemsRequest.from_dict(gradereport_user_get_grade_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


