# CoreMessageGetUnreadConversationCounts200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Favourites** | **int32** | Total number of unread favourite conversations | [default to null]
**Types** | [**CoreMessageGetUnreadConversationCounts200ResponseTypes**](CoreMessageGetUnreadConversationCounts200ResponseTypes.md) |  | 

## Methods

### NewCoreMessageGetUnreadConversationCounts200Response

`func NewCoreMessageGetUnreadConversationCounts200Response(favourites int32, types CoreMessageGetUnreadConversationCounts200ResponseTypes, ) *CoreMessageGetUnreadConversationCounts200Response`

NewCoreMessageGetUnreadConversationCounts200Response instantiates a new CoreMessageGetUnreadConversationCounts200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUnreadConversationCounts200ResponseWithDefaults

`func NewCoreMessageGetUnreadConversationCounts200ResponseWithDefaults() *CoreMessageGetUnreadConversationCounts200Response`

NewCoreMessageGetUnreadConversationCounts200ResponseWithDefaults instantiates a new CoreMessageGetUnreadConversationCounts200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFavourites

`func (o *CoreMessageGetUnreadConversationCounts200Response) GetFavourites() int32`

GetFavourites returns the Favourites field if non-nil, zero value otherwise.

### GetFavouritesOk

`func (o *CoreMessageGetUnreadConversationCounts200Response) GetFavouritesOk() (*int32, bool)`

GetFavouritesOk returns a tuple with the Favourites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFavourites

`func (o *CoreMessageGetUnreadConversationCounts200Response) SetFavourites(v int32)`

SetFavourites sets Favourites field to given value.


### GetTypes

`func (o *CoreMessageGetUnreadConversationCounts200Response) GetTypes() CoreMessageGetUnreadConversationCounts200ResponseTypes`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *CoreMessageGetUnreadConversationCounts200Response) GetTypesOk() (*CoreMessageGetUnreadConversationCounts200ResponseTypes, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *CoreMessageGetUnreadConversationCounts200Response) SetTypes(v CoreMessageGetUnreadConversationCounts200ResponseTypes)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


