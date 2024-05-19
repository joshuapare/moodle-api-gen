# EnrolMetaDeleteInstancesRequestInstancesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **str** | ID of the course where meta enrolment is linked to. | [optional] 
**metacourseid** | **int** | ID of the course with meta enrolment. | [optional] [default to null]

## Example

```python
from openapi_client.models.enrol_meta_delete_instances_request_instances_inner import EnrolMetaDeleteInstancesRequestInstancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolMetaDeleteInstancesRequestInstancesInner from a JSON string
enrol_meta_delete_instances_request_instances_inner_instance = EnrolMetaDeleteInstancesRequestInstancesInner.from_json(json)
# print the JSON string representation of the object
print(EnrolMetaDeleteInstancesRequestInstancesInner.to_json())

# convert the object into a dict
enrol_meta_delete_instances_request_instances_inner_dict = enrol_meta_delete_instances_request_instances_inner_instance.to_dict()
# create an instance of EnrolMetaDeleteInstancesRequestInstancesInner from a dict
enrol_meta_delete_instances_request_instances_inner_from_dict = EnrolMetaDeleteInstancesRequestInstancesInner.from_dict(enrol_meta_delete_instances_request_instances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


