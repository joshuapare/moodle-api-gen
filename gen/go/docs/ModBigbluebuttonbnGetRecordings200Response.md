# ModBigbluebuttonbnGetRecordings200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** | Whether the fetch was successful | [default to null]
**Tabledata** | Pointer to [**ModBigbluebuttonbnGetRecordings200ResponseTabledata**](ModBigbluebuttonbnGetRecordings200ResponseTabledata.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModBigbluebuttonbnGetRecordings200Response

`func NewModBigbluebuttonbnGetRecordings200Response(status bool, ) *ModBigbluebuttonbnGetRecordings200Response`

NewModBigbluebuttonbnGetRecordings200Response instantiates a new ModBigbluebuttonbnGetRecordings200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnGetRecordings200ResponseWithDefaults

`func NewModBigbluebuttonbnGetRecordings200ResponseWithDefaults() *ModBigbluebuttonbnGetRecordings200Response`

NewModBigbluebuttonbnGetRecordings200ResponseWithDefaults instantiates a new ModBigbluebuttonbnGetRecordings200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModBigbluebuttonbnGetRecordings200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetTabledata

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetTabledata() ModBigbluebuttonbnGetRecordings200ResponseTabledata`

GetTabledata returns the Tabledata field if non-nil, zero value otherwise.

### GetTabledataOk

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetTabledataOk() (*ModBigbluebuttonbnGetRecordings200ResponseTabledata, bool)`

GetTabledataOk returns a tuple with the Tabledata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTabledata

`func (o *ModBigbluebuttonbnGetRecordings200Response) SetTabledata(v ModBigbluebuttonbnGetRecordings200ResponseTabledata)`

SetTabledata sets Tabledata field to given value.

### HasTabledata

`func (o *ModBigbluebuttonbnGetRecordings200Response) HasTabledata() bool`

HasTabledata returns a boolean if a field has been set.

### GetWarnings

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModBigbluebuttonbnGetRecordings200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModBigbluebuttonbnGetRecordings200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModBigbluebuttonbnGetRecordings200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


