# CoreNotesGetNotes200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Notes** | [**[]CoreNotesGetNotes200ResponseNotesInner**](CoreNotesGetNotes200ResponseNotesInner.md) |  | 
**Warnings** | Pointer to [**[]CoreNotesGetNotes200ResponseWarningsInner**](CoreNotesGetNotes200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreNotesGetNotes200Response

`func NewCoreNotesGetNotes200Response(notes []CoreNotesGetNotes200ResponseNotesInner, ) *CoreNotesGetNotes200Response`

NewCoreNotesGetNotes200Response instantiates a new CoreNotesGetNotes200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreNotesGetNotes200ResponseWithDefaults

`func NewCoreNotesGetNotes200ResponseWithDefaults() *CoreNotesGetNotes200Response`

NewCoreNotesGetNotes200ResponseWithDefaults instantiates a new CoreNotesGetNotes200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNotes

`func (o *CoreNotesGetNotes200Response) GetNotes() []CoreNotesGetNotes200ResponseNotesInner`

GetNotes returns the Notes field if non-nil, zero value otherwise.

### GetNotesOk

`func (o *CoreNotesGetNotes200Response) GetNotesOk() (*[]CoreNotesGetNotes200ResponseNotesInner, bool)`

GetNotesOk returns a tuple with the Notes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotes

`func (o *CoreNotesGetNotes200Response) SetNotes(v []CoreNotesGetNotes200ResponseNotesInner)`

SetNotes sets Notes field to given value.


### GetWarnings

`func (o *CoreNotesGetNotes200Response) GetWarnings() []CoreNotesGetNotes200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreNotesGetNotes200Response) GetWarningsOk() (*[]CoreNotesGetNotes200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreNotesGetNotes200Response) SetWarnings(v []CoreNotesGetNotes200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreNotesGetNotes200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


