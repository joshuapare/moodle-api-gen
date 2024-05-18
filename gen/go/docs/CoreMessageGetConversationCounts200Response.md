# CoreMessageGetConversationCounts200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Favourites** | **int32** | Total number of favourite conversations | [default to null]
**Types** | [**CoreMessageGetConversationCounts200ResponseTypes**](CoreMessageGetConversationCounts200ResponseTypes.md) |  | 

## Methods

### NewCoreMessageGetConversationCounts200Response

`func NewCoreMessageGetConversationCounts200Response(favourites int32, types CoreMessageGetConversationCounts200ResponseTypes, ) *CoreMessageGetConversationCounts200Response`

NewCoreMessageGetConversationCounts200Response instantiates a new CoreMessageGetConversationCounts200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetConversationCounts200ResponseWithDefaults

`func NewCoreMessageGetConversationCounts200ResponseWithDefaults() *CoreMessageGetConversationCounts200Response`

NewCoreMessageGetConversationCounts200ResponseWithDefaults instantiates a new CoreMessageGetConversationCounts200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFavourites

`func (o *CoreMessageGetConversationCounts200Response) GetFavourites() int32`

GetFavourites returns the Favourites field if non-nil, zero value otherwise.

### GetFavouritesOk

`func (o *CoreMessageGetConversationCounts200Response) GetFavouritesOk() (*int32, bool)`

GetFavouritesOk returns a tuple with the Favourites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFavourites

`func (o *CoreMessageGetConversationCounts200Response) SetFavourites(v int32)`

SetFavourites sets Favourites field to given value.


### GetTypes

`func (o *CoreMessageGetConversationCounts200Response) GetTypes() CoreMessageGetConversationCounts200ResponseTypes`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *CoreMessageGetConversationCounts200Response) GetTypesOk() (*CoreMessageGetConversationCounts200ResponseTypes, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *CoreMessageGetConversationCounts200Response) SetTypes(v CoreMessageGetConversationCounts200ResponseTypes)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


