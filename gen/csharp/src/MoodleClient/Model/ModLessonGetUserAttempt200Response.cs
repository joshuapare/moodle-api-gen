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
    /// ModLessonGetUserAttempt200Response
    /// </summary>
    [DataContract(Name = "mod_lesson_get_user_attempt_200_response")]
    public partial class ModLessonGetUserAttempt200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttempt200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonGetUserAttempt200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttempt200Response" /> class.
        /// </summary>
        /// <param name="answerpages">answerpages (required).</param>
        /// <param name="userstats">userstats (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModLessonGetUserAttempt200Response(List<ModLessonGetUserAttempt200ResponseAnswerpagesInner> answerpages = default(List<ModLessonGetUserAttempt200ResponseAnswerpagesInner>), ModLessonGetUserAttempt200ResponseUserstats userstats = default(ModLessonGetUserAttempt200ResponseUserstats), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "answerpages" is required (not null)
            if (answerpages == null)
            {
                throw new ArgumentNullException("answerpages is a required property for ModLessonGetUserAttempt200Response and cannot be null");
            }
            this.Answerpages = answerpages;
            // to ensure "userstats" is required (not null)
            if (userstats == null)
            {
                throw new ArgumentNullException("userstats is a required property for ModLessonGetUserAttempt200Response and cannot be null");
            }
            this.Userstats = userstats;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Answerpages
        /// </summary>
        [DataMember(Name = "answerpages", IsRequired = true, EmitDefaultValue = true)]
        public List<ModLessonGetUserAttempt200ResponseAnswerpagesInner> Answerpages { get; set; }

        /// <summary>
        /// Gets or Sets Userstats
        /// </summary>
        [DataMember(Name = "userstats", IsRequired = true, EmitDefaultValue = true)]
        public ModLessonGetUserAttempt200ResponseUserstats Userstats { get; set; }

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
            sb.Append("class ModLessonGetUserAttempt200Response {\n");
            sb.Append("  Answerpages: ").Append(Answerpages).Append("\n");
            sb.Append("  Userstats: ").Append(Userstats).Append("\n");
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
