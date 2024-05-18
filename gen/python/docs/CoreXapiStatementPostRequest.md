# CoreXapiStatementPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | Component name | 
**requestjson** | **str** | json object with all the statements to post | [default to 'null']

## Example

```python
from openapi_client.models.core_xapi_statement_post_request import CoreXapiStatementPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreXapiStatementPostRequest from a JSON string
core_xapi_statement_post_request_instance = CoreXapiStatementPostRequest.from_json(json)
# print the JSON string representation of the object
print(CoreXapiStatementPostRequest.to_json())

# convert the object into a dict
core_xapi_statement_post_request_dict = core_xapi_statement_post_request_instance.to_dict()
# create an instance of CoreXapiStatementPostRequest from a dict
core_xapi_statement_post_request_from_dict = CoreXapiStatementPostRequest.from_dict(core_xapi_statement_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


