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
    /// MessagePopupGetPopupNotificationsRequest
    /// </summary>
    [DataContract(Name = "message_popup_get_popup_notifications_request")]
    public partial class MessagePopupGetPopupNotificationsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessagePopupGetPopupNotificationsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MessagePopupGetPopupNotificationsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessagePopupGetPopupNotificationsRequest" /> class.
        /// </summary>
        /// <param name="limit">the number of results to return (default to 0).</param>
        /// <param name="newestfirst">true for ordering by newest first, false for oldest first (default to true).</param>
        /// <param name="offset">offset the result set by a given amount (default to 0).</param>
        /// <param name="useridto">the user id who received the message, 0 for current user (required) (default to null).</param>
        public MessagePopupGetPopupNotificationsRequest(int limit = 0, bool newestfirst = true, int offset = 0, int useridto = null)
        {
            this.Useridto = useridto;
            this.Limit = limit;
            this.Newestfirst = newestfirst;
            this.Offset = offset;
        }

        /// <summary>
        /// the number of results to return
        /// </summary>
        /// <value>the number of results to return</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// true for ordering by newest first, false for oldest first
        /// </summary>
        /// <value>true for ordering by newest first, false for oldest first</value>
        [DataMember(Name = "newestfirst", EmitDefaultValue = true)]
        public bool Newestfirst { get; set; }

        /// <summary>
        /// offset the result set by a given amount
        /// </summary>
        /// <value>offset the result set by a given amount</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public int Offset { get; set; }

        /// <summary>
        /// the user id who received the message, 0 for current user
        /// </summary>
        /// <value>the user id who received the message, 0 for current user</value>
        [DataMember(Name = "useridto", IsRequired = true, EmitDefaultValue = true)]
        public int Useridto { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessagePopupGetPopupNotificationsRequest {\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Newestfirst: ").Append(Newestfirst).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Useridto: ").Append(Useridto).Append("\n");
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