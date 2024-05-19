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
    /// ModChoiceGetChoicesByCourses200Response
    /// </summary>
    [DataContract(Name = "mod_choice_get_choices_by_courses_200_response")]
    public partial class ModChoiceGetChoicesByCourses200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModChoiceGetChoicesByCourses200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModChoiceGetChoicesByCourses200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModChoiceGetChoicesByCourses200Response" /> class.
        /// </summary>
        /// <param name="choices">choices (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModChoiceGetChoicesByCourses200Response(List<ModChoiceGetChoicesByCourses200ResponseChoicesInner> choices = default(List<ModChoiceGetChoicesByCourses200ResponseChoicesInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "choices" is required (not null)
            if (choices == null)
            {
                throw new ArgumentNullException("choices is a required property for ModChoiceGetChoicesByCourses200Response and cannot be null");
            }
            this.Choices = choices;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Choices
        /// </summary>
        [DataMember(Name = "choices", IsRequired = true, EmitDefaultValue = true)]
        public List<ModChoiceGetChoicesByCourses200ResponseChoicesInner> Choices { get; set; }

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
            sb.Append("class ModChoiceGetChoicesByCourses200Response {\n");
            sb.Append("  Choices: ").Append(Choices).Append("\n");
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
