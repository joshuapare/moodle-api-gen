/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreMessageGetUnreadConversationCounts200Response
    /// </summary>
    [DataContract(Name = "core_message_get_unread_conversation_counts_200_response")]
    public partial class CoreMessageGetUnreadConversationCounts200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUnreadConversationCounts200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageGetUnreadConversationCounts200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUnreadConversationCounts200Response" /> class.
        /// </summary>
        /// <param name="favourites">Total number of unread favourite conversations (required) (default to null).</param>
        /// <param name="types">types (required).</param>
        public CoreMessageGetUnreadConversationCounts200Response(int favourites = null, CoreMessageGetUnreadConversationCounts200ResponseTypes types = default(CoreMessageGetUnreadConversationCounts200ResponseTypes))
        {
            this.Favourites = favourites;
            // to ensure "types" is required (not null)
            if (types == null)
            {
                throw new ArgumentNullException("types is a required property for CoreMessageGetUnreadConversationCounts200Response and cannot be null");
            }
            this.Types = types;
        }

        /// <summary>
        /// Total number of unread favourite conversations
        /// </summary>
        /// <value>Total number of unread favourite conversations</value>
        [DataMember(Name = "favourites", IsRequired = true, EmitDefaultValue = true)]
        public int Favourites { get; set; }

        /// <summary>
        /// Gets or Sets Types
        /// </summary>
        [DataMember(Name = "types", IsRequired = true, EmitDefaultValue = true)]
        public CoreMessageGetUnreadConversationCounts200ResponseTypes Types { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetUnreadConversationCounts200Response {\n");
            sb.Append("  Favourites: ").Append(Favourites).Append("\n");
            sb.Append("  Types: ").Append(Types).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}