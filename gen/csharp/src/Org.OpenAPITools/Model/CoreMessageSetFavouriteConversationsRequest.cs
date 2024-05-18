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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreMessageSetFavouriteConversationsRequest
    /// </summary>
    [DataContract(Name = "core_message_set_favourite_conversations_request")]
    public partial class CoreMessageSetFavouriteConversationsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageSetFavouriteConversationsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageSetFavouriteConversationsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageSetFavouriteConversationsRequest" /> class.
        /// </summary>
        /// <param name="conversations">conversations (required).</param>
        /// <param name="userid">id of the user, 0 for current user (default to 0).</param>
        public CoreMessageSetFavouriteConversationsRequest(List<Object> conversations = default(List<Object>), int userid = 0)
        {
            // to ensure "conversations" is required (not null)
            if (conversations == null)
            {
                throw new ArgumentNullException("conversations is a required property for CoreMessageSetFavouriteConversationsRequest and cannot be null");
            }
            this.Conversations = conversations;
            this.Userid = userid;
        }

        /// <summary>
        /// Gets or Sets Conversations
        /// </summary>
        [DataMember(Name = "conversations", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Conversations { get; set; }

        /// <summary>
        /// id of the user, 0 for current user
        /// </summary>
        /// <value>id of the user, 0 for current user</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageSetFavouriteConversationsRequest {\n");
            sb.Append("  Conversations: ").Append(Conversations).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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