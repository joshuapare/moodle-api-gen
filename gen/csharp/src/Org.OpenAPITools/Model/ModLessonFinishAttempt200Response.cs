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
    /// ModLessonFinishAttempt200Response
    /// </summary>
    [DataContract(Name = "mod_lesson_finish_attempt_200_response")]
    public partial class ModLessonFinishAttempt200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonFinishAttempt200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonFinishAttempt200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonFinishAttempt200Response" /> class.
        /// </summary>
        /// <param name="data">data (required).</param>
        /// <param name="messages">messages (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModLessonFinishAttempt200Response(List<ModLessonFinishAttempt200ResponseDataInner> data = default(List<ModLessonFinishAttempt200ResponseDataInner>), List<ModLessonFinishAttempt200ResponseMessagesInner> messages = default(List<ModLessonFinishAttempt200ResponseMessagesInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for ModLessonFinishAttempt200Response and cannot be null");
            }
            this.Data = data;
            // to ensure "messages" is required (not null)
            if (messages == null)
            {
                throw new ArgumentNullException("messages is a required property for ModLessonFinishAttempt200Response and cannot be null");
            }
            this.Messages = messages;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<ModLessonFinishAttempt200ResponseDataInner> Data { get; set; }

        /// <summary>
        /// Gets or Sets Messages
        /// </summary>
        [DataMember(Name = "messages", IsRequired = true, EmitDefaultValue = true)]
        public List<ModLessonFinishAttempt200ResponseMessagesInner> Messages { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonFinishAttempt200Response {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
