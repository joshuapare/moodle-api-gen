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
    /// ModPageGetPagesByCourses200Response
    /// </summary>
    [DataContract(Name = "mod_page_get_pages_by_courses_200_response")]
    public partial class ModPageGetPagesByCourses200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModPageGetPagesByCourses200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModPageGetPagesByCourses200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModPageGetPagesByCourses200Response" /> class.
        /// </summary>
        /// <param name="pages">pages (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModPageGetPagesByCourses200Response(List<ModPageGetPagesByCourses200ResponsePagesInner> pages = default(List<ModPageGetPagesByCourses200ResponsePagesInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "pages" is required (not null)
            if (pages == null)
            {
                throw new ArgumentNullException("pages is a required property for ModPageGetPagesByCourses200Response and cannot be null");
            }
            this.Pages = pages;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Pages
        /// </summary>
        [DataMember(Name = "pages", IsRequired = true, EmitDefaultValue = true)]
        public List<ModPageGetPagesByCourses200ResponsePagesInner> Pages { get; set; }

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
            sb.Append("class ModPageGetPagesByCourses200Response {\n");
            sb.Append("  Pages: ").Append(Pages).Append("\n");
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
