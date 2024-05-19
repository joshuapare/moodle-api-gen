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
    /// information about conversation
    /// </summary>
    [DataContract(Name = "core_message_get_conversation_between_users_200_response_members_inner_conversations_inner")]
    public partial class CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner" /> class.
        /// </summary>
        /// <param name="id">Conversations id.</param>
        /// <param name="name">Multilang compatible conversation name2.</param>
        /// <param name="timecreated">The timecreated timestamp for the conversation.</param>
        /// <param name="type">Conversation type: private or public.</param>
        public CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner(int id = default(int), string name = default(string), int timecreated = default(int), int type = default(int))
        {
            this.Id = id;
            this.Name = name;
            this.Timecreated = timecreated;
            this.Type = type;
        }

        /// <summary>
        /// Conversations id
        /// </summary>
        /// <value>Conversations id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Multilang compatible conversation name2
        /// </summary>
        /// <value>Multilang compatible conversation name2</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The timecreated timestamp for the conversation
        /// </summary>
        /// <value>The timecreated timestamp for the conversation</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Conversation type: private or public
        /// </summary>
        /// <value>Conversation type: private or public</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public int Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
