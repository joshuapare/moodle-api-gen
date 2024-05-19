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
    /// CoreBlogGetEntries200ResponseEntriesInnerTagsInner
    /// </summary>
    [DataContract(Name = "core_blog_get_entries_200_response_entries_inner_tags_inner")]
    public partial class CoreBlogGetEntries200ResponseEntriesInnerTagsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlogGetEntries200ResponseEntriesInnerTagsInner" /> class.
        /// </summary>
        /// <param name="flag">Whether the tag is flagged as inappropriate. (default to 0).</param>
        /// <param name="id">Tag id. (default to null).</param>
        /// <param name="isstandard">Whether this tag is standard. (default to false).</param>
        /// <param name="itemid">Id of the record tagged. (default to null).</param>
        /// <param name="name">Tag name. (default to &quot;null&quot;).</param>
        /// <param name="ordering">Tag ordering. (default to null).</param>
        /// <param name="rawname">The raw, unnormalised name for the tag as entered by users. (default to &quot;null&quot;).</param>
        /// <param name="tagcollid">Tag collection id. (default to null).</param>
        /// <param name="taginstancecontextid">Context the tag instance belongs to. (default to null).</param>
        /// <param name="taginstanceid">Tag instance id. (default to null).</param>
        public CoreBlogGetEntries200ResponseEntriesInnerTagsInner(int flag = 0, int id = null, bool isstandard = false, int itemid = null, string name = @"null", int ordering = null, string rawname = @"null", int tagcollid = null, int taginstancecontextid = null, int taginstanceid = null)
        {
            this.Flag = flag;
            this.Id = id;
            this.Isstandard = isstandard;
            this.Itemid = itemid;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Ordering = ordering;
            // use default value if no "rawname" provided
            this.Rawname = rawname ?? @"null";
            this.Tagcollid = tagcollid;
            this.Taginstancecontextid = taginstancecontextid;
            this.Taginstanceid = taginstanceid;
        }

        /// <summary>
        /// Whether the tag is flagged as inappropriate.
        /// </summary>
        /// <value>Whether the tag is flagged as inappropriate.</value>
        [DataMember(Name = "flag", EmitDefaultValue = false)]
        public int Flag { get; set; }

        /// <summary>
        /// Tag id.
        /// </summary>
        /// <value>Tag id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Whether this tag is standard.
        /// </summary>
        /// <value>Whether this tag is standard.</value>
        [DataMember(Name = "isstandard", EmitDefaultValue = true)]
        public bool Isstandard { get; set; }

        /// <summary>
        /// Id of the record tagged.
        /// </summary>
        /// <value>Id of the record tagged.</value>
        [DataMember(Name = "itemid", EmitDefaultValue = false)]
        public int Itemid { get; set; }

        /// <summary>
        /// Tag name.
        /// </summary>
        /// <value>Tag name.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Tag ordering.
        /// </summary>
        /// <value>Tag ordering.</value>
        [DataMember(Name = "ordering", EmitDefaultValue = false)]
        public int Ordering { get; set; }

        /// <summary>
        /// The raw, unnormalised name for the tag as entered by users.
        /// </summary>
        /// <value>The raw, unnormalised name for the tag as entered by users.</value>
        [DataMember(Name = "rawname", EmitDefaultValue = false)]
        public string Rawname { get; set; }

        /// <summary>
        /// Tag collection id.
        /// </summary>
        /// <value>Tag collection id.</value>
        [DataMember(Name = "tagcollid", EmitDefaultValue = false)]
        public int Tagcollid { get; set; }

        /// <summary>
        /// Context the tag instance belongs to.
        /// </summary>
        /// <value>Context the tag instance belongs to.</value>
        [DataMember(Name = "taginstancecontextid", EmitDefaultValue = false)]
        public int Taginstancecontextid { get; set; }

        /// <summary>
        /// Tag instance id.
        /// </summary>
        /// <value>Tag instance id.</value>
        [DataMember(Name = "taginstanceid", EmitDefaultValue = false)]
        public int Taginstanceid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBlogGetEntries200ResponseEntriesInnerTagsInner {\n");
            sb.Append("  Flag: ").Append(Flag).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Isstandard: ").Append(Isstandard).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Ordering: ").Append(Ordering).Append("\n");
            sb.Append("  Rawname: ").Append(Rawname).Append("\n");
            sb.Append("  Tagcollid: ").Append(Tagcollid).Append("\n");
            sb.Append("  Taginstancecontextid: ").Append(Taginstancecontextid).Append("\n");
            sb.Append("  Taginstanceid: ").Append(Taginstanceid).Append("\n");
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