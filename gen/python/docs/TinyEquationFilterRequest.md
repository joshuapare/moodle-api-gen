# TinyEquationFilterRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The equation content | [default to 'null']
**contextid** | **int** | The context ID | [default to null]

## Example

```python
from openapi_client.models.tiny_equation_filter_request import TinyEquationFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TinyEquationFilterRequest from a JSON string
tiny_equation_filter_request_instance = TinyEquationFilterRequest.from_json(json)
# print the JSON string representation of the object
print(TinyEquationFilterRequest.to_json())

# convert the object into a dict
tiny_equation_filter_request_dict = tiny_equation_filter_request_instance.to_dict()
# create an instance of TinyEquationFilterRequest from a dict
tiny_equation_filter_request_from_dict = TinyEquationFilterRequest.from_dict(tiny_equation_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


