# ToolDataprivacySetContextForm200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **bool** | Whether the data was properly set or not | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewToolDataprivacySetContextForm200Response

`func NewToolDataprivacySetContextForm200Response(result bool, ) *ToolDataprivacySetContextForm200Response`

NewToolDataprivacySetContextForm200Response instantiates a new ToolDataprivacySetContextForm200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacySetContextForm200ResponseWithDefaults

`func NewToolDataprivacySetContextForm200ResponseWithDefaults() *ToolDataprivacySetContextForm200Response`

NewToolDataprivacySetContextForm200ResponseWithDefaults instantiates a new ToolDataprivacySetContextForm200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ToolDataprivacySetContextForm200Response) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ToolDataprivacySetContextForm200Response) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ToolDataprivacySetContextForm200Response) SetResult(v bool)`

SetResult sets Result field to given value.


### GetWarnings

`func (o *ToolDataprivacySetContextForm200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ToolDataprivacySetContextForm200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ToolDataprivacySetContextForm200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ToolDataprivacySetContextForm200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


