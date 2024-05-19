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
    /// CoreMessageGetConversationBetweenUsers200ResponseMessagesInner
    /// </summary>
    [DataContract(Name = "core_message_get_conversation_between_users_200_response_messages_inner")]
    public partial class CoreMessageGetConversationBetweenUsers200ResponseMessagesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetConversationBetweenUsers200ResponseMessagesInner" /> class.
        /// </summary>
        /// <param name="id">The id of the message.</param>
        /// <param name="text">The text of the message.</param>
        /// <param name="timecreated">The timecreated timestamp for the message.</param>
        /// <param name="useridfrom">The id of the user who sent the message.</param>
        public CoreMessageGetConversationBetweenUsers200ResponseMessagesInner(int id = default(int), string text = default(string), int timecreated = default(int), int useridfrom = default(int))
        {
            this.Id = id;
            this.Text = text;
            this.Timecreated = timecreated;
            this.Useridfrom = useridfrom;
        }

        /// <summary>
        /// The id of the message
        /// </summary>
        /// <value>The id of the message</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The text of the message
        /// </summary>
        /// <value>The text of the message</value>
        [DataMember(Name = "text", EmitDefaultValue = false)]
        public string Text { get; set; }

        /// <summary>
        /// The timecreated timestamp for the message
        /// </summary>
        /// <value>The timecreated timestamp for the message</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// The id of the user who sent the message
        /// </summary>
        /// <value>The id of the user who sent the message</value>
        [DataMember(Name = "useridfrom", EmitDefaultValue = false)]
        public int Useridfrom { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetConversationBetweenUsers200ResponseMessagesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Useridfrom: ").Append(Useridfrom).Append("\n");
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
