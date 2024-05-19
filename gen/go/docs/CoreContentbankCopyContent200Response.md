# CoreContentbankCopyContent200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The id of the new content | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreContentbankCopyContent200Response

`func NewCoreContentbankCopyContent200Response(id int32, ) *CoreContentbankCopyContent200Response`

NewCoreContentbankCopyContent200Response instantiates a new CoreContentbankCopyContent200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreContentbankCopyContent200ResponseWithDefaults

`func NewCoreContentbankCopyContent200ResponseWithDefaults() *CoreContentbankCopyContent200Response`

NewCoreContentbankCopyContent200ResponseWithDefaults instantiates a new CoreContentbankCopyContent200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CoreContentbankCopyContent200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreContentbankCopyContent200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreContentbankCopyContent200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetWarnings

`func (o *CoreContentbankCopyContent200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreContentbankCopyContent200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreContentbankCopyContent200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreContentbankCopyContent200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


