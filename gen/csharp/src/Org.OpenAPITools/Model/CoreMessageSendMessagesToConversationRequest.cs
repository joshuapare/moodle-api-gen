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
    /// CoreMessageSendMessagesToConversationRequest
    /// </summary>
    [DataContract(Name = "core_message_send_messages_to_conversation_request")]
    public partial class CoreMessageSendMessagesToConversationRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageSendMessagesToConversationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageSendMessagesToConversationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageSendMessagesToConversationRequest" /> class.
        /// </summary>
        /// <param name="conversationid">id of the conversation (required) (default to null).</param>
        /// <param name="messages">messages (required).</param>
        public CoreMessageSendMessagesToConversationRequest(int conversationid = null, List<CoreMessageSendMessagesToConversationRequestMessagesInner> messages = default(List<CoreMessageSendMessagesToConversationRequestMessagesInner>))
        {
            this.Conversationid = conversationid;
            // to ensure "messages" is required (not null)
            if (messages == null)
            {
                throw new ArgumentNullException("messages is a required property for CoreMessageSendMessagesToConversationRequest and cannot be null");
            }
            this.Messages = messages;
        }

        /// <summary>
        /// id of the conversation
        /// </summary>
        /// <value>id of the conversation</value>
        [DataMember(Name = "conversationid", IsRequired = true, EmitDefaultValue = true)]
        public int Conversationid { get; set; }

        /// <summary>
        /// Gets or Sets Messages
        /// </summary>
        [DataMember(Name = "messages", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreMessageSendMessagesToConversationRequestMessagesInner> Messages { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageSendMessagesToConversationRequest {\n");
            sb.Append("  Conversationid: ").Append(Conversationid).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
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
