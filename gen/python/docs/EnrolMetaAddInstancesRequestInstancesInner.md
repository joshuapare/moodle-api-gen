# EnrolMetaAddInstancesRequestInstancesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **str** | ID of the course where meta enrolment is linked to. | [optional] [default to 'null']
**creategroup** | **bool** | Creates group in meta course named after linked course and puts all enrolled users in this group | [optional] [default to False]
**metacourseid** | **int** | ID of the course where meta enrolment is added. | [optional] [default to null]

## Example

```python
from openapi_client.models.enrol_meta_add_instances_request_instances_inner import EnrolMetaAddInstancesRequestInstancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolMetaAddInstancesRequestInstancesInner from a JSON string
enrol_meta_add_instances_request_instances_inner_instance = EnrolMetaAddInstancesRequestInstancesInner.from_json(json)
# print the JSON string representation of the object
print(EnrolMetaAddInstancesRequestInstancesInner.to_json())

# convert the object into a dict
enrol_meta_add_instances_request_instances_inner_dict = enrol_meta_add_instances_request_instances_inner_instance.to_dict()
# create an instance of EnrolMetaAddInstancesRequestInstancesInner from a dict
enrol_meta_add_instances_request_instances_inner_from_dict = EnrolMetaAddInstancesRequestInstancesInner.from_dict(enrol_meta_add_instances_request_instances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


