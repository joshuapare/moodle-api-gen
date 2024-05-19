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
    /// ModH5pactivityGetH5pactivityAccessInformation200Response
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_get_h5pactivity_access_information_200_response")]
    public partial class ModH5pactivityGetH5pactivityAccessInformation200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetH5pactivityAccessInformation200Response" /> class.
        /// </summary>
        /// <param name="canaddinstance">Whether the user has the capability mod/h5pactivity:addinstance allowed. (default to null).</param>
        /// <param name="canreviewattempts">Whether the user has the capability mod/h5pactivity:reviewattempts allowed. (default to null).</param>
        /// <param name="cansubmit">Whether the user has the capability mod/h5pactivity:submit allowed. (default to null).</param>
        /// <param name="canview">Whether the user has the capability mod/h5pactivity:view allowed. (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModH5pactivityGetH5pactivityAccessInformation200Response(bool canaddinstance = null, bool canreviewattempts = null, bool cansubmit = null, bool canview = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Canaddinstance = canaddinstance;
            this.Canreviewattempts = canreviewattempts;
            this.Cansubmit = cansubmit;
            this.Canview = canview;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Whether the user has the capability mod/h5pactivity:addinstance allowed.
        /// </summary>
        /// <value>Whether the user has the capability mod/h5pactivity:addinstance allowed.</value>
        [DataMember(Name = "canaddinstance", EmitDefaultValue = true)]
        public bool Canaddinstance { get; set; }

        /// <summary>
        /// Whether the user has the capability mod/h5pactivity:reviewattempts allowed.
        /// </summary>
        /// <value>Whether the user has the capability mod/h5pactivity:reviewattempts allowed.</value>
        [DataMember(Name = "canreviewattempts", EmitDefaultValue = true)]
        public bool Canreviewattempts { get; set; }

        /// <summary>
        /// Whether the user has the capability mod/h5pactivity:submit allowed.
        /// </summary>
        /// <value>Whether the user has the capability mod/h5pactivity:submit allowed.</value>
        [DataMember(Name = "cansubmit", EmitDefaultValue = true)]
        public bool Cansubmit { get; set; }

        /// <summary>
        /// Whether the user has the capability mod/h5pactivity:view allowed.
        /// </summary>
        /// <value>Whether the user has the capability mod/h5pactivity:view allowed.</value>
        [DataMember(Name = "canview", EmitDefaultValue = true)]
        public bool Canview { get; set; }

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
            sb.Append("class ModH5pactivityGetH5pactivityAccessInformation200Response {\n");
            sb.Append("  Canaddinstance: ").Append(Canaddinstance).Append("\n");
            sb.Append("  Canreviewattempts: ").Append(Canreviewattempts).Append("\n");
            sb.Append("  Cansubmit: ").Append(Cansubmit).Append("\n");
            sb.Append("  Canview: ").Append(Canview).Append("\n");
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
