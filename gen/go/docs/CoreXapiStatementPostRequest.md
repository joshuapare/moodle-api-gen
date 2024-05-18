# CoreXapiStatementPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | Component name | 
**Requestjson** | **string** | json object with all the statements to post | [default to "null"]

## Methods

### NewCoreXapiStatementPostRequest

`func NewCoreXapiStatementPostRequest(component string, requestjson string, ) *CoreXapiStatementPostRequest`

NewCoreXapiStatementPostRequest instantiates a new CoreXapiStatementPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreXapiStatementPostRequestWithDefaults

`func NewCoreXapiStatementPostRequestWithDefaults() *CoreXapiStatementPostRequest`

NewCoreXapiStatementPostRequestWithDefaults instantiates a new CoreXapiStatementPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreXapiStatementPostRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreXapiStatementPostRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreXapiStatementPostRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetRequestjson

`func (o *CoreXapiStatementPostRequest) GetRequestjson() string`

GetRequestjson returns the Requestjson field if non-nil, zero value otherwise.

### GetRequestjsonOk

`func (o *CoreXapiStatementPostRequest) GetRequestjsonOk() (*string, bool)`

GetRequestjsonOk returns a tuple with the Requestjson field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestjson

`func (o *CoreXapiStatementPostRequest) SetRequestjson(v string)`

SetRequestjson sets Requestjson field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


