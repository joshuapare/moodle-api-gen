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
    /// CoreMessageGetUnreadConversationCounts200ResponseTypes
    /// </summary>
    [DataContract(Name = "core_message_get_unread_conversation_counts_200_response_types")]
    public partial class CoreMessageGetUnreadConversationCounts200ResponseTypes : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUnreadConversationCounts200ResponseTypes" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageGetUnreadConversationCounts200ResponseTypes() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUnreadConversationCounts200ResponseTypes" /> class.
        /// </summary>
        /// <param name="var1">Total number of unread individual conversations (required) (default to null).</param>
        /// <param name="var2">Total number of unread group conversations (required) (default to null).</param>
        /// <param name="var3">Total number of unread self conversations (required) (default to null).</param>
        public CoreMessageGetUnreadConversationCounts200ResponseTypes(int var1 = null, int var2 = null, int var3 = null)
        {
            this.Var1 = var1;
            this.Var2 = var2;
            this.Var3 = var3;
        }

        /// <summary>
        /// Total number of unread individual conversations
        /// </summary>
        /// <value>Total number of unread individual conversations</value>
        [DataMember(Name = "1", IsRequired = true, EmitDefaultValue = true)]
        public int Var1 { get; set; }

        /// <summary>
        /// Total number of unread group conversations
        /// </summary>
        /// <value>Total number of unread group conversations</value>
        [DataMember(Name = "2", IsRequired = true, EmitDefaultValue = true)]
        public int Var2 { get; set; }

        /// <summary>
        /// Total number of unread self conversations
        /// </summary>
        /// <value>Total number of unread self conversations</value>
        [DataMember(Name = "3", IsRequired = true, EmitDefaultValue = true)]
        public int Var3 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetUnreadConversationCounts200ResponseTypes {\n");
            sb.Append("  Var1: ").Append(Var1).Append("\n");
            sb.Append("  Var2: ").Append(Var2).Append("\n");
            sb.Append("  Var3: ").Append(Var3).Append("\n");
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